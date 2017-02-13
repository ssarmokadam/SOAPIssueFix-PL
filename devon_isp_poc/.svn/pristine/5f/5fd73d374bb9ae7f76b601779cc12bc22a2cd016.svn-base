package com.intesasanpaolo.fenice.ispfenice.general.dataaccess.impl.dao;

import java.sql.Date;

import javax.inject.Named;

import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.IntervistaEntity;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.dao.IntervistaDao;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaSearchCriteriaTo;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link IntervistaDao}.
 */
@Named
public class IntervistaDaoImpl extends ApplicationDaoImpl<IntervistaEntity> implements IntervistaDao {

  /**
   * The constructor.
   */
  public IntervistaDaoImpl() {

    super();
  }

  @Override
  public Class<IntervistaEntity> getEntityClass() {

    return IntervistaEntity.class;
  }

  @Override
  public PaginatedListTo<IntervistaEntity> findIntervistas(IntervistaSearchCriteriaTo criteria) {

    IntervistaEntity intervista = Alias.alias(IntervistaEntity.class);
    EntityPathBase<IntervistaEntity> alias = Alias.$(intervista);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    Long idIntervista = criteria.getIdIntervista();
    if (idIntervista != null) {
      query.where(Alias.$(intervista.getIdIntervista()).eq(idIntervista));
    }
    String nome = criteria.getNome();
    if (nome != null) {
      query.where(Alias.$(intervista.getNome()).eq(nome));
    }
    String cognome = criteria.getCognome();
    if (cognome != null) {
      query.where(Alias.$(intervista.getCognome()).eq(cognome));
    }
    Date dataNascita = criteria.getDataNascita();
    if (dataNascita != null) {
      query.where(Alias.$(intervista.getDataNascita()).eq(dataNascita));
    }
    String ndg = criteria.getNdg();
    if (ndg != null) {
      query.where(Alias.$(intervista.getNdg()).eq(ndg));
    }
    String codAbi = criteria.getCodAbi();
    if (codAbi != null) {
      query.where(Alias.$(intervista.getCodAbi()).eq(codAbi));
    }
    String cellulare = criteria.getCellulare();
    if (cellulare != null) {
      query.where(Alias.$(intervista.getCellulare()).eq(cellulare));
    }
    String email = criteria.getEmail();
    if (email != null) {
      query.where(Alias.$(intervista.getEmail()).eq(email));
    }
    String indirizzo = criteria.getIndirizzo();
    if (indirizzo != null) {
      query.where(Alias.$(intervista.getIndirizzo()).eq(indirizzo));
    }
    return findPaginated(criteria, query, alias);
  }

}