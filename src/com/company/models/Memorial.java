package com.company.models;

import java.util.ArrayList;

public class Memorial {
    public int id;
    public String nome;
    public ArrayList<Video>    videos;
    public ArrayList<Image>    imagens;
    public ArrayList<Mensagem> mensagens;
    public ArrayList<Visita>   visitas;

    public Memorial() {

    }

    public Memorial(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImagen(Image imagen) {
        imagens.add(imagen);
    }

    public ArrayList<Image> getImagens() {
        return imagens;
    }

    public void setVideo(Video video) {
       videos.add(video);
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setMensagen(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setVisita(Visita visita) {
        visitas.add(visita);
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }
}
