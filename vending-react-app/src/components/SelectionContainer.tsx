import "./SelectionContainer.css";

const SelectionContainer = () => {
    return (
        <div id="selected-product-container">
            <h1>You have selected: </h1>
            <div id="product-info-container">
                <h1 className="product-info"> Product Name </h1>
                <p className="product-info"> Product Price </p>
            </div>
            <div id="buttons-container">
                <button id="pay-button">Pay</button>
                <button>Cancel</button>
            </div>
            
        </div>
    )
};

export default SelectionContainer;

