public interface Gestor {
    public List<Product> productsByPrize();
    public void addOrder(Order o);
    public Order getOrder();
    public List<Order> orderByUser(String idUser);
    public List<Product> productsSortBySales();
}
