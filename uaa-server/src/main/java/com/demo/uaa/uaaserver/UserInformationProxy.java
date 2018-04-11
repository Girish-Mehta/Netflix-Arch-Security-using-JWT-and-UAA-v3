package com.demo.uaa.uaaserver;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(value="zuul")
@RibbonClient(name="registration-service")
public interface UserInformationProxy {

	@GetMapping("registration-service/login/{userId}/{password}")
	public String getUserInformationn(@PathVariable(value = "userId") String id,@PathVariable(value = "password") String password);
}