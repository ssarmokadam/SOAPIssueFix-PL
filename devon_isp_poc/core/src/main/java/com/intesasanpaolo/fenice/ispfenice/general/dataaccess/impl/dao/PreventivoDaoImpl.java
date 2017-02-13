package com.intesasanpaolo.fenice.ispfenice.general.dataaccess.impl.dao;

import javax.inject.Named;

import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.PreventivoEntity;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.dao.PreventivoDao;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoSearchCriteriaTo;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link PreventivoDao}.
 */
@Named
public class PreventivoDaoImpl extends ApplicationDaoImpl<PreventivoEntity> implements PreventivoDao {

  /**
   * The constructor.
   */
  public PreventivoDaoImpl() {

    super();
  }

  @Override
  public Class<PreventivoEntity> getEntityClass() {

    return PreventivoEntity.class;
  }

  @Override
  public PaginatedListTo<PreventivoEntity> findPreventivos(PreventivoSearchCriteriaTo criteria) {

    PreventivoEntity preventivo = Alias.alias(PreventivoEntity.class);
    EntityPathBase<PreventivoEntity> alias = Alias.$(preventivo);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    Long idPreventivo = criteria.getIdPreventivo();
    if (idPreventivo != null) {
      query.where(Alias.$(preventivo.getIdPreventivo()).eq(idPreventivo));
    }
    String codProdotto = criteria.getCodProdotto();
    if (codProdotto != null) {
      query.where(Alias.$(preventivo.getCodProdotto()).eq(codProdotto));
    }
    Long importoRichiesto = criteria.getImportoRichiesto();
    if (importoRichiesto != null) {
      query.where(Alias.$(preventivo.getImportoRichiesto()).eq(importoRichiesto));
    }
    Long durataMesi = criteria.getDurataMesi();
    if (durataMesi != null) {
      query.where(Alias.$(preventivo.getDurataMesi()).eq(durataMesi));
    }
    Long offerta = criteria.getOffertaId();
    if (offerta != null) {
      if (preventivo.getOfferta() != null) {
        query.where(Alias.$(preventivo.getOfferta().getId()).eq(offerta));
      }
    }
    return findPaginated(criteria, query, alias);
  }

}