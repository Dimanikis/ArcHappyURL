$(document).ready(function(){
    loadData();
});

function loadData() {
    $("#data > tbody").empty();

    $.getJSON('/admin/stat', function(data) {
        var i;

        for (i = 0; i < data.length; i++) {
            $('#data > tbody:last-child').append(
                $('<tr>')
                    .append($('<td>').append(data[i].url))
                    .append($('<td>').append(data[i].shortUrl))
                    .append($('<td>').append(data[i].redirects))
                    .append($('<td>').append(data[i].lastAccess))
            );
        }
    });
}