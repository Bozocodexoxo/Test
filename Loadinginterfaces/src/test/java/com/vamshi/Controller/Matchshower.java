package com.vamshi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vamshi.services.Ipls;
import com.vamshi.services.Odis;

@RestController
public class Matchshower {
	@Autowired
	Odis odis;
	@Autowired
	Ipls ipl;
	@GetMapping("/odi/{count}")
	public ResponseEntity my( @PathVariable  int count) {
	return  new ResponseEntity(ok,);
	}
	@GetMapping("/ipls/{count}")
	public int getmatchcountipl(@PathVariable int count) {
		return  count;


}
}