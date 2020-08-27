package demo.controller;

import demo.model.City;
import demo.service.CityService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CityServlet",urlPatterns = "/index")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<City> cities = CityService.getAllcities();
        request.setAttribute("cities",cities);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/City/List.jsp");
        requestDispatcher.forward(request,response);
    }
}
