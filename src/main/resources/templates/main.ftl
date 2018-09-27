<#import "parts/common.ftl" as c>

<@c.page>
<div class="form-row">
    <div class="form-group col-md-6">
        <form method="get" action="/main" class="form-inline">
            <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Search by tag">
            <button type="submit" class="btn btn-primary ml-2">Search</button>
        </form>
    </div>
</div>

<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    Add new Contact
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">
                <input type="text" class="form-control" name="name" placeholder="Имя" />
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="surname" placeholder="Фамилия">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="patronymic" placeholder="Отчество">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="mobilePhone" placeholder="Мобильный">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="phone" placeholder="Домашний">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="address" placeholder="Адрес">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="e_mail" placeholder="e_mail">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="tag" placeholder="Должность">
            </div>
            <div class="form-group">
                <div class="custom-file">
                    <input type="file" name="file" id="customFile">
                    <label class="custom-file-label" for="customFile">Choose file</label>
                </div>
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </form>
    </div>
</div>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Имя</th>
        <th scope="col">Фамилия</th>
        <th scope="col">Отчество</th>
        <th scope="col">Сотовый</th>
        <th scope="col">Домашний</th>
        <th scope="col">Адресс</th>
        <th scope="col">e_mail</th>
        <th scope="col">должность</th>
    </tr>
    </thead>
        <#list messages as message>
    <tbody>
       <tr>
        <th scope="row">${message.id}</th>
        <td>${message.name}</td>
        <td>${message.surname}</td>
        <td>${message.patronymic}</td>
        <td>${message.mobilePhone}</td>
        <td>${message.phone}</td>
        <td>${message.address}</td>
        <td>${message.e_mail}</td>
        <td>${message.tag}</td>
    </tr>

    </tbody>
        </#list>
</table>

</@c.page>