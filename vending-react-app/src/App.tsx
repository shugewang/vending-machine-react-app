import React from 'react';
import logo from './logo.svg';
import './App.css';
import ProductsContainer from "./components/ProductsContainer"
import SelectionContainer from './components/SelectionContainer';

function App() {
  return (
    <div id="page-container">
      <div id="app-container">
        <div className="title-container">
          <h1> Vending Machine </h1>
          </div>
          <div id="product-container">
            <ProductsContainer></ProductsContainer>
          </div>
          <div id="selection-container">
            <SelectionContainer></SelectionContainer>
          </div>
        </div>
      </div>
  );
}

export default App;
