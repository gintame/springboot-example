package com.it.component;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("===========filter=========");
//        System.out.println("/");
        //
        filterChain.doFilter(servletRequest, servletResponse);
//        filterChain.

    }

}
