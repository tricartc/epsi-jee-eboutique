package fr.epsi.eboutique.business.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class MarqueService {

  /**
   * Permet de récupérer l'entity manager via le CDI 
   */
  @PersistenceContext
  private EntityManager em;
  
  
}
