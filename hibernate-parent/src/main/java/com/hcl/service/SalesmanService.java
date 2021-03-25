package com.hcl.service;

import java.util.List;

import com.hcl.model.Salesman;

public interface SalesmanService {
	public Salesman saveSalesman(Salesman salesman);

	public Salesman updateSalesman(Salesman salesman);

	public Salesman getSalesman(int Salesman_id);

	public void deleteSalesman(int Salesman_id);

	public List<Salesman> getAllSalesman();


}
