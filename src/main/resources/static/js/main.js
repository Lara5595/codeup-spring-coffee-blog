$(document).ready(function (){
    $(".favorite").on('click', function (){
        let customerId = $(this).attr("data-customer-id");
        let coffeeId = $(this).attr("data-coffee-id");
        $.get("/coffee/customer" + customerId + "/favorite/" + coffeeId);
    })
})