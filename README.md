# BackEnd-APIdeProductos
Desarrollo de API conectada a base de datos Oracle con Java y Spring

Conección a base de datos usando la interface CrudRepository y notaciones de SpringBoot para alimentar una API que disponibiliza una lista de productos y listas de productos organizados por categoria y los envía con el método GET a través de archivos JSON como este:

{ "productos": [ { "name": "Coca Cola", "price": 1400.0, "discount": 0, "category": 1, "id": 1 } ] }
