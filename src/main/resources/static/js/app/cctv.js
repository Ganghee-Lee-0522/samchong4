var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            place: $('#place').val(),
            content: $('#content').val(),
            admin: $('#admin').val()
        };

        $.ajax({
            type: 'POST',
            url: '/cctvposts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('신규 CCTV 정보가 등록되었습니다.');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    }

};

main.init();