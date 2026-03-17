package com.primerproyecto.api.controller;

import com.primerproyecto.api.dto.ProductDTO;
import com.primerproyecto.api.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> listar() {
        return productService.listarTodos();
    }

    @GetMapping("/{id}")
    public ProductDTO obtener(@PathVariable Long id) {
        return productService.obtenerPorId(id);
    }

    @PostMapping
    public ProductDTO crear(@RequestBody ProductDTO dto) {
        return productService.guardar(dto);
    }

    @PutMapping("/{id}")
    public ProductDTO actualizar(@PathVariable Long id, @RequestBody ProductDTO dto) {
        return productService.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return productService.eliminar(id);
    }
}