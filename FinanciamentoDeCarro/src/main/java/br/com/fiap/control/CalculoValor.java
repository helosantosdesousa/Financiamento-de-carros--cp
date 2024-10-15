package br.com.fiap.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculoValor")
public class CalculoValor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CalculoValor() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("oi Served at: ").append(request.getContextPath());
		
		//pegar os valores
		String nome = request.getParameter("nome");
		Double valor = Double.parseDouble(request.getParameter("valor"));
		Double taxa = Double.parseDouble(request.getParameter("taxa"));
		int prazo = Integer.parseInt(request.getParameter("prazo"));


		//conta
		
		double r = ((taxa/100)/12);
		double n = prazo*12;
		
		double parcela = (valor*r*Math.pow(1+r, n))/(Math.pow(1+r, n)-1);
		double valorTotal = parcela*n; 
		double diferencaValor = valorTotal-valor;
	
		
		//exibir no console
		System.out.println("\n");
		System.out.println("-------------- VALOR TOTAL DE FINANCIAMENTO --------------");
		System.out.println("Cliente: " + nome);
		System.out.println("Valor da parcela mensal: R$ " + parcela);
		System.out.println("Valor total pago R$: " + valorTotal);
		System.out.println("Diferença entre valor inicial e pago R$: " + diferencaValor);
		
		//exibir novamente o index.html
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.forward(request, response);
	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}