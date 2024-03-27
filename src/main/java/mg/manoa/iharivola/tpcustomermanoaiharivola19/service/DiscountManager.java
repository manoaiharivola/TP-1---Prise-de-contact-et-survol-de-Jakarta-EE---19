/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.manoa.iharivola.tpcustomermanoaiharivola19.service;

import mg.manoa.iharivola.tpcustomermanoaiharivola19.entity.Discount;
import java.util.List;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

/**
 * Façade pour gérer les Discounts.
 *
 * @author My PC
 */
@RequestScoped
public class DiscountManager {

    @PersistenceContext
    private EntityManager em;

    public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }
    
    public List<Discount> getAllDiscountsOrderByRate() {
        Query query = em.createNamedQuery("Discount.findAllOrderByRate");
        return query.getResultList();
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }
}