function compreJson(obj1, obj2) {
    var flag = true;
    function compre(obj1, obj2) {
        if (Object.keys(obj1).length != Object.keys(obj2).length) {
            flag = false;
        } else {
            for (var x in obj1) {
                if (obj2.hasOwnProperty(x)) {
                    if (obj1[x] != obj2[x]) {
                        if (typeof(obj1[x]) == "number" || typeof(obj1[x]) == "string" || typeof(obj2[x]) == "number" || typeof(obj2[x]) == "string") {
                            flag = false;
                        } else {
                            compre(obj1[x], obj2[x]);
                        }
                    }
                } else {
                    flag = false;
                }
            }
        }
        if (flag === false) {
            return false;
        } else {
            return true;
        }
    }
    return compre(obj1, obj2)
}