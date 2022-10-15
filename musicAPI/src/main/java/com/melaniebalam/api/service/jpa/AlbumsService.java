package com.melaniebalam.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melaniebalam.api.entity.Album;
import com.melaniebalam.api.repository.AlbumsRepository;
import com.melaniebalam.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

}
