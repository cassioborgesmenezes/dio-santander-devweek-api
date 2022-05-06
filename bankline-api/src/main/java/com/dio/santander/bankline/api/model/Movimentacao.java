package com.dio.santander.bankline.api.model;

import java.math.BigDecimal;
import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A classe {@code Movimentacao} apresenta os dados de movimentacao bancaria.
 * <p>
 * 
 * @author cassiomenezes
 * @since 2022-05-03
 */
@Entity
@Table(name = "t_Movimentacao")
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal					id;
	private Timestamp					dataHora;
	private String						descricao;
	private BigDecimal					valor;

	@Enumerated
	private MovimentacaoTipoEnum		tipo;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Timestamp getDataHora() {
		return dataHora;
	}

	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public MovimentacaoTipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Movimentacao [dataHora=" + dataHora + ", descricao=" + descricao + ", id=" + id + ", tipo=" + tipo
				+ ", valor=" + valor + "]";
	}

	
}
