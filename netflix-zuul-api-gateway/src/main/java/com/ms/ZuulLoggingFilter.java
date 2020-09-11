package com.ms;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		// filter for every request
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// real logic of intercepter
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request ->{} request uri -> {} request url -> {}", request, request.getRequestURI(), request.getRequestURL());
		return null;
	}

	@Override
	public String filterType() {
		// when want to use filter before all the request
		return "pre";   // post, error, ....
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
