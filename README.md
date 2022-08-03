# SimpleRestSpringBoot
Не сделал:
1. DTO (грубо передавал из запроса в entity без обработки) => DTOFactory
2. Service (Почему-то некоторые считают, что это лишний слой абстракции между Repository и контроллером)
3. обработка ошибок не кастомная. на совести boot'a
Сделано:
Person с двумя простыми полям id,name
PersonController -> RestController, в котором реализованы все основные HTTP-запросы (GET,PUT,DELETE,UPDATE). В http-клиенте (внутрення idea'ешная) проверял
БД - Postgres локально запускал, но в application.properties прописано всё необходимое для подключения
