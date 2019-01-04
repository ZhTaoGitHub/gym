package com.bj.group6.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GlobalExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        GlobalException globalException = null;
        if(e instanceof GlobalException){
            globalException = (GlobalException) e;
        }
        else{
            globalException = new GlobalException(e.getMessage());
        }
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("message",globalException.getMessage());

        return modelAndView;
    }
}
