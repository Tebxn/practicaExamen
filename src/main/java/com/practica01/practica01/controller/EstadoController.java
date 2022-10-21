package com.practica01.practica01.controller;

import com.practica01.practica01.entity.Estado;
import com.practica01.practica01.entity.Pais;
import com.practica01.practica01.service.IEstadoService;
import com.practica01.practica01.service.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//-----------Controler-------------

@Controller
public class EstadoController {
    
    @Autowired
    private IEstadoService estadoService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/estado")
    public String index(Model model){
        List<Estado> listaEstado = estadoService.getAllEstado();
        model.addAttribute("titulo", "Tabla Estados");
        model.addAttribute("estados", listaEstado);
        return "estado";
                
    }
    @GetMapping("/estadoNew")
    public String crearEstado(Model model){
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("estado", new Estado());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    @PostMapping("/save")
    public String guardarEstado(@ModelAttribute Estado estado){
        estadoService.saveEstado(estado);
        return "redirect:/estado";
    }
    
   @GetMapping("/editEstados/{id}")
   public String editarEstado(@PathVariable("id") Long idEstado, Model model){
       Estado estado = estadoService.getEstadoById(idEstado);
       List<Pais> listaPaises = paisService.listCountry();
       model.addAttribute("estado", estado);
       model.addAttribute("paises", listaPaises);
       return "crear";
   }
   @GetMapping("/delete/{id}")
   public String eliminarEstado(@PathVariable("id") Long idEstado){
       estadoService.delete(idEstado);
       return "redirect:/estado";
   }
}
