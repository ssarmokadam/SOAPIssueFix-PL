package com.intesasanpaolo.fenice.ispfenice.general.service.api.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.PaginatedListToWrapper;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoEto;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * @author riraman
 *
 */
@WebService
public interface GeneralSoapService {

  @WebMethod
  @WebResult(name = "message")
  @GET
  public IntervistaEto getIntervista(@WebParam(name = "id") long id);

  @WebMethod
  @WebResult(name = "message")
  @GET
  public OffertaEto getOfferta(@WebParam(name = "id") long id);

  @WebMethod
  @WebResult(name = "message")
  @GET
  public PreventivoEto getPreventivo(@WebParam(name = "id") long id);

  @WebMethod
  @WebResult(name = "message")
  @POST
  public IntervistaEto saveIntervista(IntervistaEto intervista);

  @WebMethod
  @WebResult(name = "message")
  @POST
  public PreventivoEto savePreventivo(PreventivoEto preventivo);

  @WebMethod
  @WebResult(name = "message")
  @POST
  public OffertaEto saveOfferta(OffertaEto offerta);

  @WebMethod
  @WebResult(name = "message")
  @DELETE
  public void deleteIntervista(@WebParam(name = "id") long id);

  @WebMethod
  @WebResult(name = "message")
  @DELETE
  public void deleteOfferta(@WebParam(name = "id") long id);

  @WebMethod
  @WebResult(name = "message")
  @DELETE
  public void deletePreventivo(@WebParam(name = "id") long id);

  @WebMethod
  @WebResult(name = "message")
  @POST
  public PaginatedListTo<OffertaEto> findOffertasByPost(OffertaSearchCriteriaTo searchCriteriaTo);

  @WebMethod
  @WebResult(name = "message")
  @POST
  public PaginatedListToWrapper<IntervistaEto> findIntervistasByPost(IntervistaSearchCriteriaTo searchCriteriaTo);
}
