<!DOCTYPE html>
<html>
<head>
    <title>Витрина-магазин главная страница</title>
</head>
<body>
<h1>ОБЪЯВЛЕНИЯ</h1><hr>
<h4>Все товары списком</h4>
<#list PageProductsList as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text" name="title"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Имя: <input type="text" name="author"/><br><br>
    Иное: <input type="text" name="something"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>