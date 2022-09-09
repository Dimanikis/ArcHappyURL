function shorten(text){
    $.post('/shorten', function (data) {
        $('#shorturl').text(data.UrlResultDTO.short.url)
    });
}
