package com.myproject;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/BookAmbulanceServlet")
public class BookAmbulanceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // Retrieve form data
        String patientName = request.getParameter("patientName");
        String contactNumber = request.getParameter("contactNumber");
        String location = request.getParameter("location");

     

        // Send response to the client
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Booking Confirmation</title></head><body>");
        response.getWriter().println("<h2>Ambulance booked successfully!</h2>");
        response.getWriter().println("<p>Patient Name: " + patientName + "</p>");
        response.getWriter().println("<p>Contact Number: " + contactNumber + "</p>");
        response.getWriter().println("<p>Location: " + location + "</p>");
        response.getWriter().println("</body></html>");
    }
}

