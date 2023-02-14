package com.javatechie.spring.zulu.api.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class RouteFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(RouteFilter.class);

	@Override
	public String filterType() {
		return "route";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		if(request.getHeader("test")!= null) {
			System.out.println("jwt validation in hospital gateway");
			String tests = request.getHeader("test");
			ctx.addZuulRequestHeader("tests",tests);
		}
		
		
		log.info("RouteFilter: " + String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
		
		return null;
	}
}