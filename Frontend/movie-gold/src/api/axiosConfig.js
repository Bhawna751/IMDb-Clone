import axios from 'axios';
export default axios.create({
    baseURL:'https://01d96431e8db.ngrok-free.app ',
    headers:{"ngrok-skip-browser-warning":"true"}
});