import "./ProductsContainer.css";
import ProductTile from "./ProductTile";

const ProductsContainer = () => {
    return (
        <div id="tiles-container">
                <ProductTile></ProductTile>
                <ProductTile></ProductTile>
                <ProductTile></ProductTile>
                <ProductTile></ProductTile>
        </div>
    )
};

export default ProductsContainer;

