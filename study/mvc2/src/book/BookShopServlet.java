package book;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BookShopServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
											throws ServletException, IOException {
		req.setCharacterEncoding("EUC-KR");
		resp.setContentType("text/html; charset=EUC-KR");
		
		String cmd = req.getParameter("command");
		
		HttpSession session = req.getSession();//���ǰ��� ������ �ȴ�.
		List<BookDTO> cart = (List)session.getAttribute("cart");
		
		if (cmd.equals("CHK")) {
			Map<String, BookDTO> res = new Hashtable<>();//Ű�� ������, �� : BookDTO
			for(BookDTO dto : cart) {
				if (res.containsKey(dto.getTitle())) {//�������� ���ٸ� ������ �����ش�
					BookDTO dto2 = res.get(dto.getTitle());
					dto2.setQty(dto2.getQty() + dto.getQty());
				}else {		//�������� Ʋ���� dto��ü�� ��������ش�.
					res.put(dto.getTitle(), dto);
				}
			}
			req.setAttribute("order", res);
			RequestDispatcher view = req.getRequestDispatcher("result.jsp");
			view.forward(req, resp);
			
		}else {
			if (cmd.equals("ADD")) {
				if (cart == null) {
					cart = new ArrayList<>();
				}
				BookDTO dto = getBook(req);
				cart.add(dto);
			}else if (cmd.equals("DEL")){
				String index = req.getParameter("index");
				cart.remove(Integer.parseInt(index));
			}
			session.setAttribute("cart", cart); 
			RequestDispatcher view = req.getRequestDispatcher("bookShop.jsp");
			view.forward(req, resp);
		}
	}
	
	protected BookDTO getBook(HttpServletRequest req) {
		String data = req.getParameter("book");
		String qty = req.getParameter("qty");
		BookDTO dto = new BookDTO();
		Scanner in = new Scanner(data).useDelimiter("\\s*/\\s*");
		dto.setTitle(in.next());
		dto.setAuthor(in.next());
		dto.setPrice(in.nextInt());
		dto.setQty(Integer.parseInt(qty));
		return dto;
	}
	
}










