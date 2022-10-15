package com.melaniebalam.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melaniebalam.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
