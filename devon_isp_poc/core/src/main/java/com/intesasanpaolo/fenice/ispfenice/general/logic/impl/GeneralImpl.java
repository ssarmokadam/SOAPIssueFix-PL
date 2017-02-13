package com.intesasanpaolo.fenice.ispfenice.general.logic.impl;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.IntervistaEntity;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.OffertaEntity;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.PreventivoEntity;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.dao.IntervistaDao;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.dao.OffertaDao;
import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.dao.PreventivoDao;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.General;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.base.AbstractComponentFacade;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Implementation of component interface of general
 */
@Named
@Transactional
public class GeneralImpl extends AbstractComponentFacade implements General {

  /**
   * Logger instance.
   */
  private static final Logger LOG = LoggerFactory.getLogger(GeneralImpl.class);

  /**
   * @see #getPreventivoDao()
   */
  @Inject
  private PreventivoDao preventivoDao;

  /**
   * @see #getOffertaDao()
   */
  @Inject
  private OffertaDao offertaDao;

  /**
   * @see #getIntervistaDao()
   */
  @Inject
  private IntervistaDao intervistaDao;

  /**
   * The constructor.
   */
  public GeneralImpl() {

    super();
  }

  @Override
  public PreventivoEto findPreventivo(Long id) {

    LOG.debug("Get Preventivo with id {} from database.", id);
    return getBeanMapper().map(getPreventivoDao().findOne(id), PreventivoEto.class);
  }

  @Override
  public PaginatedListTo<PreventivoEto> findPreventivoEtos(PreventivoSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<PreventivoEntity> preventivos = getPreventivoDao().findPreventivos(criteria);
    return mapPaginatedEntityList(preventivos, PreventivoEto.class);
  }

  @Override
  public boolean deletePreventivo(Long preventivoId) {

    PreventivoEntity preventivo = getPreventivoDao().find(preventivoId);
    getPreventivoDao().delete(preventivo);
    LOG.debug("The preventivo with id '{}' has been deleted.", preventivoId);
    return true;
  }

  @Override
  public PreventivoEto savePreventivo(PreventivoEto preventivo) {

    Objects.requireNonNull(preventivo, "preventivo");
    PreventivoEntity preventivoEntity = getBeanMapper().map(preventivo, PreventivoEntity.class);

    // initialize, validate preventivoEntity here if necessary
    getPreventivoDao().save(preventivoEntity);
    LOG.debug("Preventivo with id '{}' has been created.", preventivoEntity.getId());

    return getBeanMapper().map(preventivoEntity, PreventivoEto.class);
  }

  /**
   * Returns the field 'preventivoDao'.
   *
   * @return the {@link PreventivoDao} instance.
   */
  public PreventivoDao getPreventivoDao() {

    return this.preventivoDao;
  }

  @Override
  public OffertaEto findOfferta(Long id) {

    LOG.debug("Get Offerta with id {} from database.", id);
    return getBeanMapper().map(getOffertaDao().findOne(id), OffertaEto.class);
  }

  @Override
  public PaginatedListTo<OffertaEto> findOffertaEtos(OffertaSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<OffertaEntity> offertas = getOffertaDao().findOffertas(criteria);
    return mapPaginatedEntityList(offertas, OffertaEto.class);
  }

  @Override
  public boolean deleteOfferta(Long offertaId) {

    OffertaEntity offerta = getOffertaDao().find(offertaId);
    getOffertaDao().delete(offerta);
    LOG.debug("The offerta with id '{}' has been deleted.", offertaId);
    return true;
  }

  @Override
  public OffertaEto saveOfferta(OffertaEto offerta) {

    Objects.requireNonNull(offerta, "offerta");
    OffertaEntity offertaEntity = getBeanMapper().map(offerta, OffertaEntity.class);

    // initialize, validate offertaEntity here if necessary
    getOffertaDao().save(offertaEntity);
    LOG.debug("Offerta with id '{}' has been created.", offertaEntity.getId());

    return getBeanMapper().map(offertaEntity, OffertaEto.class);
  }

  /**
   * Returns the field 'offertaDao'.
   *
   * @return the {@link OffertaDao} instance.
   */
  public OffertaDao getOffertaDao() {

    return this.offertaDao;
  }

  @Override
  public IntervistaEto findIntervista(Long id) {

    LOG.debug("Get Intervista with id {} from database.", id);
    return getBeanMapper().map(getIntervistaDao().findOne(id), IntervistaEto.class);
  }

  @Override
  public PaginatedListTo<IntervistaEto> findIntervistaEtos(IntervistaSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<IntervistaEntity> intervistas = getIntervistaDao().findIntervistas(criteria);
    return mapPaginatedEntityList(intervistas, IntervistaEto.class);
  }

  @Override
  public boolean deleteIntervista(Long intervistaId) {

    IntervistaEntity intervista = getIntervistaDao().find(intervistaId);
    getIntervistaDao().delete(intervista);
    LOG.debug("The intervista with id '{}' has been deleted.", intervistaId);
    return true;
  }

  @Override
  public IntervistaEto saveIntervista(IntervistaEto intervista) {

    IntervistaEntity intervistaRec = null;
    Objects.requireNonNull(intervista, "intervista");
    IntervistaEntity intervistaEntity = getBeanMapper().map(intervista, IntervistaEntity.class);
    IntervistaSearchCriteriaTo criteria = new IntervistaSearchCriteriaTo();
    criteria.setIdIntervista(intervista.getIdIntervista());
    if (intervista.getIdIntervista() != null) {
      List<IntervistaEntity> intervistaList = getIntervistaDao().findIntervistas(criteria).getResult();
      if (intervistaList != null && !intervistaList.isEmpty())
        intervistaRec = intervistaList.get(0);
    }

    if (intervistaRec == null) {
      getIntervistaDao().save(intervistaEntity);
    } else {
      intervistaRec.setCellulare(intervistaEntity.getCellulare());
      intervistaRec.setCodAbi(intervistaEntity.getCodAbi());
      intervistaRec.setCognome(intervistaEntity.getCognome());
      intervistaRec.setDataNascita(intervistaEntity.getDataNascita());
      intervistaRec.setEmail(intervistaEntity.getEmail());

      // intervistaRec.setId(intervistaEntity.getId());

      // intervistaRec.setIdIntervista(intervistaEntity.getIdIntervista());

      intervistaRec.setIndirizzo(intervistaEntity.getIndirizzo());
      intervistaRec.setModificationCounter(intervistaEntity.getModificationCounter());
      getIntervistaDao().save(intervistaRec);

    }

    // initialize, validate intervistaEntity here if necessary

    // getIntervistaDao().save(intervistaEntity);

    LOG.debug("Intervista with id '{}' has been created/updated for ", intervistaEntity.getIdIntervista());

    return getBeanMapper().map(intervistaEntity, IntervistaEto.class);
  }

  /**
   * Returns the field 'intervistaDao'.
   *
   * @return the {@link IntervistaDao} instance.
   */
  public IntervistaDao getIntervistaDao() {

    return this.intervistaDao;
  }

}
