package com.melaniebalam.api.service;

import java.util.List;
import com.melaniebalam.api.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
