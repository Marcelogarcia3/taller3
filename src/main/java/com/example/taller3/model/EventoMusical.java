package com.example.taller3.model;

import java.util.ArrayList;
import java.util.Date;

public class EventoMusical {
    private String nombreEvento;
    private Date fecha;
    private String lugar;
    private ArrayList<Artista> artistas;

    public EventoMusical(String nombreEvento, Date fecha, String lugar, ArrayList<Artista> artistas) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;
        this.artistas = artistas;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
}
