package com.atypon.kdbms.servlets;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "main", value = "/main")
public class MainServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("views/main.jsp").forward(request,response);
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        Scanner sc = null;
        String output = "";
        String input = request.getParameter("input");
        try {
            socket = new Socket("127.0.0.1", 2000);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("insert into student ( free 21 )");
            output = in.readLine();
            System.out.println(output);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            socket.close();
            out.close();
            in.close();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        Scanner sc = null;
        String output = "";
        String input = request.getParameter("input");
//        try {
//            socket = new Socket("127.0.0.1", 2000);
//            out = new PrintWriter(socket.getOutputStream(), true);
//            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//            out.println(input);
//            output = in.readLine();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            socket.close();
//            out.close();
//            in.close();
//        }
        request.setAttribute("output", output);
    }
        public void destroy(){}
}
