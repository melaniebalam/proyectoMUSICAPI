package com.melaniebalam.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melaniebalam.api.entity.Album;
import com.melaniebalam.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbums;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbums.buscarTodos();
	}
}
