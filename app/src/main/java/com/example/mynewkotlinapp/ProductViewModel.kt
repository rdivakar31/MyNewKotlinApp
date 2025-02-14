package com.example.mynewkotlinapp

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.mynewkotlinapp.api.ProductRepository
import com.example.mynewkotlinapp.model.Product

class ProductViewModel : ViewModel() {
    var products = mutableStateListOf<Product>()
        private set

    init {
        loadProducts()
    }

    private fun loadProducts() {
        products.addAll(ProductRepository.getProducts())
    }
}
