package com.intesasanpaolo.fenice.ispfenice.general.service.impl.soap;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.web.context.WebApplicationContext;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.PaginatedListToWrapper;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.General;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.IntervistaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaEto;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.OffertaSearchCriteriaTo;
import com.intesasanpaolo.fenice.ispfenice.general.logic.api.to.PreventivoEto;
import com.intesasanpaolo.fenice.ispfenice.general.service.api.soap.GeneralSoapService;
import com.intesasanpaolo.fenice.ispfenice.general.service.impl.config.WebApplicationContextLocator;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * @author riraman
 *
 */
@Named("GeneralSoapService")
@WebService(endpointInterface = "com.intesasanpaolo.fenice.ispfenice.general.service.api.soap.GeneralSoapService")
public class GeneralSoapServiceImpl implements GeneralSoapService {

  @Inject
  private General general;

  public GeneralSoapServiceImpl() {
    AutowiredAnnotationBeanPostProcessor aabpp = new AutowiredAnnotationBeanPostProcessor();
    WebApplicationContext currentContext = WebApplicationContextLocator.getCurrentWebApplicationContext();
    if (currentContext != null) {
      aabpp.setBeanFactory(currentContext.getAutowireCapableBeanFactory());
      aabpp.processInjection(this);
    }
  }

  @Override
  public PreventivoEto getPreventivo(long id) {

    return this.general.findPreventivo(id);
  }

  @Override
  public PreventivoEto savePreventivo(PreventivoEto preventivo) {

    return this.general.savePreventivo(preventivo);
  }

  @Override
  public void deletePreventivo(long id) {

    this.general.deletePreventivo(id);
  }

  /*
   * @Override public PaginatedListTo<PreventivoEto> findPreventivosByPost(PreventivoSearchCriteriaTo searchCriteriaTo)
   * {
   *
   * return this.general.findPreventivoEtos(searchCriteriaTo); }
   */
  @Override
  public OffertaEto getOfferta(long id) {

    return this.general.findOfferta(id);
  }

  @Override
  public OffertaEto saveOfferta(OffertaEto offerta) {

    return this.general.saveOfferta(offerta);
  }

  @Override
  public void deleteOfferta(long id) {

    this.general.deleteOfferta(id);
  }

  @Override
  public PaginatedListTo<OffertaEto> findOffertasByPost(OffertaSearchCriteriaTo searchCriteriaTo) {

    return this.general.findOffertaEtos(searchCriteriaTo);
  }

  @Override
  public IntervistaEto getIntervista(long id) {

    return this.general.findIntervista(id);
  }

  @Override
  public IntervistaEto saveIntervista(IntervistaEto intervista) {

    System.out.println(">>>>>>>>>>>>>>>>>>>" + intervista.getId());
    ;
    return this.general.saveIntervista(intervista);
  }

  @Override
  public void deleteIntervista(long id) {

    this.general.deleteIntervista(id);
  }

  @Override
  public PaginatedListToWrapper<IntervistaEto> findIntervistasByPost(IntervistaSearchCriteriaTo searchCriteriaTo) {

    PaginatedListTo<IntervistaEto> actualResult = this.general.findIntervistaEtos(searchCriteriaTo);
    PaginatedListToWrapper<IntervistaEto> wrapper = new PaginatedListToWrapper<>();
    wrapper.setResult(actualResult.getResult());
    wrapper.setPagination(actualResult.getPagination());
    return wrapper;
  }

}
