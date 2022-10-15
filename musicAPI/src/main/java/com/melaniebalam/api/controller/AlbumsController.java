package com.melaniebalam.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melaniebalam.api.entity.Album;
import com.melaniebalam.api.service.IAlbumsService;

@RestController // reciben peticiones con un formato de específico que cumple con formatos de
				// solicitud RESTful habitualmente y mayormente en JSON , aunque a veces se usan
				// otros como HTML, XML, o simplemente texto.
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbums;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbums.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) { // Al colocar esa anotaciom antes de la variable de tipo ALBUM le estamos diciendo a
		//spring que cuando se haga la peticion POST va buscar en el cuerpo de la peticion la inf. en formato JSON y realiza el DATASOURCE
		serviceAlbums.guardar(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbums.guardar(album); 
		return album;
	}
	
	@DeleteMapping("/albums/{id}") // para eliminar un registro en POSTMAN
	public String eliminar(@PathVariable("id") int idAlbum) {
		serviceAlbums.eliminar(idAlbum);
		return "Registro Eliminado";
	}
}
