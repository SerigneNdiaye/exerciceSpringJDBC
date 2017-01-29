package com.serigne.customer.dao;

import com.serigne.customer.model.Customer;

public interface CustomerDAO
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
