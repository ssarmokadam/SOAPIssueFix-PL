package com.intesasanpaolo.fenice.ispfenice.general.logic.api;

import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for General component.
 */
public interface General {

  /**
   * Returns a Preventivo by its id 'id'.
   *
   * @param id The id 'id' of the Preventivo.
   * @return The {@link PreventivoEto} with id 'id'
   */
  PreventivoEto findPreventivo(Long id);

  /**
   * Returns a paginated list of Preventivos matching the search criteria.
   *
   * @param criteria the {@link PreventivoSearchCriteriaTo}.
   * @return the {@link List} of matching {@link PreventivoEto}s.
   */
  PaginatedListTo<PreventivoEto> findPreventivoEtos(PreventivoSearchCriteriaTo criteria);

  /**
   * Deletes a preventivo from the database by its id 'preventivoId'.
   *
   * @param preventivoId Id of the preventivo to delete
   * @return boolean <code>true</code> if the preventivo can be deleted, <code>false</code> otherwise
   */
  boolean deletePreventivo(Long preventivoId);

  /**
   * Saves a preventivo and store it in the database.
   *
   * @param preventivo the {@link PreventivoEto} to create.
   * @return the new {@link PreventivoEto} that has been saved with ID and version.
   */
  PreventivoEto savePreventivo(PreventivoEto preventivo);

  /**
   * Returns a Offerta by its id 'id'.
   *
   * @param id The id 'id' of the Offerta.
   * @return The {@link OffertaEto} with id 'id'
   */
  OffertaEto findOfferta(Long id);

  /**
   * Returns a paginated list of Offertas matching the search criteria.
   *
   * @param criteria the {@link OffertaSearchCriteriaTo}.
   * @return the {@link List} of matching {@link OffertaEto}s.
   */
  PaginatedListTo<OffertaEto> findOffertaEtos(OffertaSearchCriteriaTo criteria);

  /**
   * Deletes a offerta from the database by its id 'offertaId'.
   *
   * @param offertaId Id of the offerta to delete
   * @return boolean <code>true</code> if the offerta can be deleted, <code>false</code> otherwise
   */
  boolean deleteOfferta(Long offertaId);

  /**
   * Saves a offerta and store it in the database.
   *
   * @param offerta the {@link OffertaEto} to create.
   * @return the new {@link OffertaEto} that has been saved with ID and version.
   */
  OffertaEto saveOfferta(OffertaEto offerta);

  /**
   * Returns a Intervista by its id 'id'.
   *
   * @param id The id 'id' of the Intervista.
   * @return The {@link IntervistaEto} with id 'id'
   */
  IntervistaEto findIntervista(Long id);

  /**
   * Returns a paginated list of Intervistas matching the search criteria.
   *
   * @param criteria the {@link IntervistaSearchCriteriaTo}.
   * @return the {@link List} of matching {@link IntervistaEto}s.
   */
  PaginatedListTo<IntervistaEto> findIntervistaEtos(IntervistaSearchCriteriaTo criteria);

  /**
   * Deletes a intervista from the database by its id 'intervistaId'.
   *
   * @param intervistaId Id of the intervista to delete
   * @return boolean <code>true</code> if the intervista can be deleted, <code>false</code> otherwise
   */
  boolean deleteIntervista(Long intervistaId);

  /**
   * Saves a intervista and store it in the database.
   *
   * @param intervista the {@link IntervistaEto} to create.
   * @return the new {@link IntervistaEto} that has been saved with ID and version.
   */
  IntervistaEto saveIntervista(IntervistaEto intervista);

}
