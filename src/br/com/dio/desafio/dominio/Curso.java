package br.com.dio.desafio.dominio;

import static br.com.dio.desafio.dominio.Conteudo.XP_PADRAO;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public String getDescricao() {
        return null;
    }

    public String getTitulo() {
        return null;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public void setTitulo(
            String curso_java) {
    }

    public void setDescricao(
            String descrição_curso_js) {
    }
}

