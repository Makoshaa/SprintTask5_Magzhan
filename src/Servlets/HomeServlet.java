package Servlets;

import DataBase.DBUtil;

import DataBase.DBUtil;
import DataBase.Items;
import DataBase.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet (value = "/home.html")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Items> tasks= DBUtil.getItems();
        req.setAttribute("tovary",tasks);
        req.getRequestDispatcher("/items.jsp").forward(req,resp);
    }
}
