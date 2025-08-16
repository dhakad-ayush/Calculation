package com.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/info")

public class BackService extends HttpServlet  {
	
	
	@Override
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
	        throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		
	    int amount =  Integer.parseInt(req.getParameter("amount"));
		String dateStr = req.getParameter("startd"); 
        LocalDate startd = LocalDate.parse(dateStr);
        String dateStri = req.getParameter("endd"); 
        LocalDate endd = LocalDate.parse(dateStri);
        double rate =  Double.parseDouble(req.getParameter("interest"));
        String type = req.getParameter("type");
        
        
        Period period = Period.between(startd, endd);
        int year = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();
        
        
        if(type.equals("compound")) {
        
        int sum = amount;
        
        
        for(int i = 0; i<year; i++) {
        	sum = (int)(sum*12*rate/100)+sum;
        }
        
        int formonth = (int)(sum*rate/100);
         sum = sum + (formonth*month);
         
         int forday = formonth/30;
         sum = sum + (forday * days);
      
         
         
  
         
         
         
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Result</title>");
         out.println("<style>");
         out.println("body { font-family: Arial; background-color: #f2f2f2; margin: 0; padding: 0; }");
         out.println(".result { background: white; padding: 20px; width: 100%; box-sizing: border-box; border-radius: 0; box-shadow: 0 0 10px rgba(0,0,0,0.2); }");
         out.println(".result h2 { color: orange; text-align: center; }");
         out.println(".result p { text-align: center; }");
         out.println(".total { color: green; text-align: center; }");
         /* ✅ Mobile responsive text size */
         out.println("@media (max-width: 576px) {");
         out.println("  .result { padding: 15px; }");
         out.println("  .result h2 { font-size: 20px; }");
         out.println("  .result p, .total { font-size: 16px; }");
         out.println("}");
         out.println("</style>");
         out.println("</head>");
         out.println("<body>");
         out.println("<div class='result'>");
         
         out.println("<h2>राशि एवं दिनांक</h2>");
         out.println("<p><b>प्रारंभ दिनांक : </b> " + startd + "</p>");
         out.println("<p><b>समाप्ति दिनांक : </b> " + endd + "</p>");
         out.println("<p><b>राशि : </b> " + amount + "</p>");
         out.println("<h2>कुल समय</h2>");
         out.println("<p><b>वर्ष : </b> " + year + "</p>");
         out.println("<p><b>महीने : </b> " + month + "</p>");
         out.println("<p><b>दिन : </b> " + days + "</p>");
         out.println("<p><b>ब्याज का प्रकार : चक्रवृद्धि </b> </p>");
         out.println("<p><b>ब्याज दर : </b> " + rate + "%</p>");
         out.println("<p><b>ब्याज : </b> " + (sum - amount) + "</p>");
         out.println("<h1 class='total'><b>कुल राशि :</b> " + sum + "</h1>");
         out.println("</div>");
         out.println("</body>");
         out.println("</html>");
         
        }
        
        else if(type.equals("simple")) {
            
            int sum = amount;
            int formonth = (int)(sum*rate/100);
            
            int temp = (year*12)+month;
            
            sum = (int)((sum*temp*rate/100)+sum);
            
           
           
             
             
             int forday = formonth/30;
             sum = sum + (forday * days);
          
             
             
      
             
             
             
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Result</title>");
             out.println("<style>");
             out.println("body { font-family: Arial; background-color: #f2f2f2; margin: 0; padding: 0; }");
             out.println(".result { background: white; padding: 20px; width: 100%; box-sizing: border-box; border-radius: 0; box-shadow: 0 0 10px rgba(0,0,0,0.2); }");
             out.println(".result h2 { color: orange; text-align: center; }");
             out.println(".result p { text-align: center; }");
             out.println(".total { color: green; text-align: center; }");
             /* ✅ Mobile responsive text size */
             out.println("@media (max-width: 576px) {");
             out.println("  .result { padding: 15px; }");
             out.println("  .result h2 { font-size: 20px; }");
             out.println("  .result p, .total { font-size: 16px; }");
             out.println("}");
             out.println("</style>");
             out.println("</head>");
             out.println("<body>");
             out.println("<div class='result'>");
            
             out.println("<h2>राशि एवं दिनांक</h2>");
             out.println("<p><b>प्रारंभ दिनांक : </b> " + startd + "</p>");
             out.println("<p><b>समाप्ति दिनांक : </b> " + endd + "</p>");
             out.println("<p><b>राशि : </b> " + amount + "</p>");
             out.println("<h2>कुल समय</h2>");
             out.println("<p><b>वर्ष : </b> " + year + "</p>");
             out.println("<p><b>महीने : </b> " + month + "</p>");
             out.println("<p><b>दिन : </b> " + days + "</p>");
             out.println("<p><b>ब्याज का प्रकार : साधारण </b> </p>");
             out.println("<p><b>ब्याज दर : </b> " + rate + "%</p>");
             out.println("<p><b>ब्याज : </b> " + (sum - amount) + "</p>");
             out.println("<h1 class='total'><b>कुल राशि :</b> " + sum + "</h1>");
             out.println("</div>");
             out.println("</body>");
             out.println("</html>");
             
            }
        
        
        else {
        	 out.println("</\"किसी तकनीकी समस्या के कारण यह पृष्ठ उपलब्ध नहीं है।\r\n"
        	 		+ "हमें हुई असुविधा के लिए खेद है।\r\n"
        	 		+ "समाधान हेतु कृपया Ayush से संपर्क करें।\">");
        	 out.println("</संपर्क - 6232874135>");
        	 
        }
        
       

        
        
        
        
	}

}
