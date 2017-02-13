package com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.dao;

import com.intesasanpaolo.fenice.ispfenice.general.dataaccess.api.PreventivoEntity;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Preventivo entities
 */
public interface PreventivoDao extends ApplicationDao<PreventivoEntity> {

  /**
   * Finds the {@link PreventivoEntity preventivos} matching the given {@link PreventivoSearchCriteriaTo}.
   *
   * @param criteria is the {@link PreventivoSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link PreventivoEntity} objects.
   */
  PaginatedListTo<PreventivoEntity> findPreventivos(PreventivoSearchCriteriaTo criteria);
}
