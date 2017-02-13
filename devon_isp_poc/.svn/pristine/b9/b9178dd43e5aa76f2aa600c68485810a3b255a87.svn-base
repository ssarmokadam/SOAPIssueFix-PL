package com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.Preventivo;

/**
 * @author riraman
 */
@Entity
@javax.persistence.Table(name = "PREVENTIVO")
public class PreventivoEntity extends ApplicationPersistenceEntity implements Preventivo {

  @Column(name = "IDPREVENTIVO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPreventivo;

  @Column(name = "CODPRODOTTO")
  private String codProdotto;

  @Column(name = "IMPORTORICHIESTO")
  private Long importoRichiesto;

  @Column(name = "DURATAMESI")
  private Long durataMesi;

  private OffertaEntity offerta;

  private static final long serialVersionUID = 1L;

  /**
   * The default constructor.
   */
  public PreventivoEntity() {

  }

  /**
   * @return idPreventivo
   */
  public Long getIdPreventivo() {

    return this.idPreventivo;
  }

  /**
   * @param idPreventivo new value of {@link #getidPreventivo}.
   */
  public void setIdPreventivo(Long idPreventivo) {

    this.idPreventivo = idPreventivo;
  }

  /**
   * @return codProdotto
   */
  public String getCodProdotto() {

    return this.codProdotto;
  }

  /**
   * @param codProdotto new value of {@link #getcodProdotto}.
   */
  public void setCodProdotto(String codProdotto) {

    this.codProdotto = codProdotto;
  }

  /**
   * @return importoRichiesto
   */
  public Long getImportoRichiesto() {

    return this.importoRichiesto;
  }

  /**
   * @param importoRichiesto new value of {@link #getimportoRichiesto}.
   */
  public void setImportoRichiesto(Long importoRichiesto) {

    this.importoRichiesto = importoRichiesto;
  }

  /**
   * @return durataMesi
   */
  public Long getDurataMesi() {

    return this.durataMesi;
  }

  /**
   * @param durataMesi new value of {@link #getdurataMesi}.
   */
  public void setDurataMesi(Long durataMesi) {

    this.durataMesi = durataMesi;
  }

  /**
   * @return offerta
   */
  @ManyToOne
  @JoinColumn(name = "IDOFFERTA")
  public OffertaEntity getOfferta() {

    return this.offerta;
  }

  /**
   * @param offerta new value of {@link #getofferta}.
   */
  public void setOfferta(OffertaEntity offerta) {

    this.offerta = offerta;
  }

  @Override
  @Transient
  public Long getOffertaId() {

    if (this.offerta == null) {
      return null;
    }
    return this.offerta.getId();
  }

  @Override
  public void setOffertaId(Long offertaId) {

    if (offertaId == null) {
      this.offerta = null;
    } else {
      OffertaEntity offertaEntity = new OffertaEntity();
      offertaEntity.setId(offertaId);
      this.offerta = offertaEntity;
    }
  }

}
