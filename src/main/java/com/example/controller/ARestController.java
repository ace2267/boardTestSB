package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.BoardDomain;
import com.example.service.BoardService;
import com.google.gson.Gson;

@RestController

public class ARestController {
	
	@Autowired
	private BoardService boardService;
	
	private static Logger logger = LoggerFactory.getLogger(ARestController.class);
	
	// 전체 보기
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> list() throws Exception{
		List<BoardDomain> boardList = boardService.findAll();

		Gson gg = new Gson();
		
		return new ResponseEntity<String>(gg.toJson(boardList), HttpStatus.OK);
	}
}
