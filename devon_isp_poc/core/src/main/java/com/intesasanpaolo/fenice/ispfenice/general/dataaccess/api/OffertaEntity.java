package com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.Offerta;

/**
 * @author riraman
 */
@Entity
@javax.persistence.Table(name = "OFFERTA")
public class OffertaEntity extends ApplicationPersistenceEntity implements Offerta {

  @Column(name = "IDOFFERTA")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idOfferta;

  @Column(name = "NDG")
  private String ndg;

  private IntervistaEntity intervista;

  private Set<PreventivoEntity> preventivo;

  private static final long serialVersionUID = 1L;

  /**
   * The default constructor.
   */
  public OffertaEntity() {

  }

  /**
   * @return idOfferta
   */
  public Long getIdOfferta() {

    return this.idOfferta;
  }

  /**
   * @param idOfferta new value of {@link #getidOfferta}.
   */
  public void setIdOfferta(Long idOfferta) {

    this.idOfferta = idOfferta;
  }

  /**
   * @return ndg
   */
  public String getNdg() {

    return this.ndg;
  }

  /**
   * @param ndg new value of {@link #getndg}.
   */
  public void setNdg(String ndg) {

    this.ndg = ndg;
  }

  /**
   * @return intervista
   */
  @ManyToOne
  @JoinColumn(name = "IDINTERVISTA")
  public IntervistaEntity getIntervista() {

    return this.intervista;
  }

  /**
   * @param intervista new value of {@link #getintervista}.
   */
  public void setIntervista(IntervistaEntity intervista) {

    this.intervista = intervista;
  }

  /**
   * @return preventivo
   */
  @OneToMany(mappedBy = "offerta",  fetch = FetchType.EAGER)
  public Set<PreventivoEntity> getPreventivo() {

    return this.preventivo;
  }

  /**
   * @param preventivo new value of {@link #getpreventivo}.
   */
  public void setPreventivo(Set<PreventivoEntity> preventivo) {

    this.preventivo = preventivo;
  }

  @Override
  @Transient
  public Long getIntervistaId() {

    if (this.intervista == null) {
      return null;
    }
    return this.intervista.getId();
  }

  @Override
  public void setIntervistaId(Long intervistaId) {

    if (intervistaId == null) {
      this.intervista = null;
    } else {
      IntervistaEntity intervistaEntity = new IntervistaEntity();
      intervistaEntity.setId(intervistaId);
      this.intervista = intervistaEntity;
    }
  }

}
