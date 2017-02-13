package com.intesasanpaolo.fenice.ispfenice.general.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.intesasanpaolo.fenice.ispfenice.general.logic.api.General;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link General}.
 */
@Path("/general/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface GeneralRestService {

  /**
   * Delegates to {@link General#findPreventivo}.
   *
   * @param id the ID of the {@link PreventivoEto}
   * @return the {@link PreventivoEto}
   */
  @GET
  @Path("/preventivo/{id}/")
  public PreventivoEto getPreventivo(@PathParam("id") long id);

  /**
   * Delegates to {@link General#savePreventivo}.
   *
   * @param preventivo the {@link PreventivoEto} to be saved
   * @return the recently created {@link PreventivoEto}
   */
  @POST
  @Path("/preventivo/")
  public PreventivoEto savePreventivo(PreventivoEto preventivo);

  /**
   * Delegates to {@link General#deletePreventivo}.
   *
   * @param id ID of the {@link PreventivoEto} to be deleted
   */
  @DELETE
  @Path("/preventivo/{id}/")
  public void deletePreventivo(@PathParam("id") long id);

  /**
   * Delegates to {@link General#findPreventivoEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding preventivos.
   * @return the {@link PaginatedListTo list} of matching {@link PreventivoEto}s.
   */
  @Path("/preventivo/search")
  @POST
  public PaginatedListTo<PreventivoEto> findPreventivosByPost(PreventivoSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link General#findOfferta}.
   *
   * @param id the ID of the {@link OffertaEto}
   * @return the {@link OffertaEto}
   */
  @GET
  @Path("/offerta/{id}/")
  public OffertaEto getOfferta(@PathParam("id") long id);

  /**
   * Delegates to {@link General#saveOfferta}.
   *
   * @param offerta the {@link OffertaEto} to be saved
   * @return the recently created {@link OffertaEto}
   */
  @POST
  @Path("/offerta/")
  public OffertaEto saveOfferta(OffertaEto offerta);

  /**
   * Delegates to {@link General#deleteOfferta}.
   *
   * @param id ID of the {@link OffertaEto} to be deleted
   */
  @DELETE
  @Path("/offerta/{id}/")
  public void deleteOfferta(@PathParam("id") long id);

  /**
   * Delegates to {@link General#findOffertaEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding offertas.
   * @return the {@link PaginatedListTo list} of matching {@link OffertaEto}s.
   */
  @Path("/offerta/search")
  @POST
  public PaginatedListTo<OffertaEto> findOffertasByPost(OffertaSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link General#findIntervista}.
   *
   * @param id the ID of the {@link IntervistaEto}
   * @return the {@link IntervistaEto}
   */
  @GET
  @Path("/intervista/{id}/")
  public IntervistaEto getIntervista(@PathParam("id") long id);

  /**
   * Delegates to {@link General#saveIntervista}.
   *
   * @param intervista the {@link IntervistaEto} to be saved
   * @return the recently created {@link IntervistaEto}
   */
  @POST
  @Path("/intervista/")
  public IntervistaEto saveIntervista(IntervistaEto intervista);

  /**
   * Delegates to {@link General#deleteIntervista}.
   *
   * @param id ID of the {@link IntervistaEto} to be deleted
   */
  @DELETE
  @Path("/intervista/{id}/")
  public void deleteIntervista(@PathParam("id") long id);

  /**
   * Delegates to {@link General#findIntervistaEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding intervistas.
   * @return the {@link PaginatedListTo list} of matching {@link IntervistaEto}s.
   */
  @Path("/intervista/search")
  @POST
  public PaginatedListTo<IntervistaEto> findIntervistasByPost(IntervistaSearchCriteriaTo searchCriteriaTo);

}
